package com.example.ssumc_week7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import com.example.ssumc_week7.databinding.ActivityMainBinding
import android.media.SoundPool
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val soundPool = SoundPool.Builder().build()
    var timer = 0
    var timerStart = false
    var started = false
    private var soundTick: Int? = null

    private val handler = object:Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            if (started) {
                when{
                    timerStart->{
                        binding.tvCounttimer.text = timer.toString()
                        timer -= 1
                        if (timer == -1) {
                            timerStart = false
                            started = false
                            TimerEnd()
                            initSoundPool()
//                            soundTick?.let {
//                                soundPool.play(it, 1F, 1F, 0, -1, 1F)
//                            }
                        }
                    }
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            started = true
            binding.btnStart.isEnabled = false
            TimerStart()
        }

        /*
        var pictureArraylist = ArrayList<Int>()
        var handler = Handler(Looper.getMainLooper())

        pictureArraylist.add(R.drawable.disney)
        pictureArraylist.add(R.drawable.pocky)
        pictureArraylist.add(R.drawable.rapunzel)
        pictureArraylist.add(R.drawable.simson)

        Thread() {
            for (i in pictureArraylist) {
                Thread.sleep(1000)
                handler.post {
                    binding.imgMainChangePicture.setImageResource(i)
                }
            }
        }.start()
        */
    }
    private fun TimerStart() {
        timer = binding.edtTime.text.toString().toInt()
        timerStart = true
        thread(start=true) {
            while(timer>=0) {
                Log.d("MyDebug", "timer: ${timer}")
                handler.sendEmptyMessage(0)
                Thread.sleep(1000)
            }
        }

    }
    private fun TimerEnd() {
        started = false
        timerStart = false
        timer = 0
    }
    private fun initSoundPool() {
        val soundTick = soundPool.load(this, R.raw.ding, 1)
        soundPool.setOnLoadCompleteListener{ soundPool, i, status ->
            val soundTickID = soundPool.play(soundTick, 0.6f, 0.6f, 1, -1, 1f)
        }
    }


}
