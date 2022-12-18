import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.ssumc_week5.MainActivity
import com.example.ssumc_week5.databinding.ActivityMemoBinding
/*
class MemoActivity() : AppCompatActivity(), Parcelable {
    private lateinit var  viewbinding : ActivityMemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding = ActivityMemoBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)

        var titleText = viewbinding.titleText
        var editText = viewbinding.editText

        viewbinding.btnNext.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("title",titleText.getText().toString())
            intent.putExtra("desc",editText.getText().toString())
            setResult(RESULT_OK,intent)
            finish()
            //액티비티를 끝내는 코드
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart() 호출됨", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop() 호출됨", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy() 호출됨", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart() 호출됨", Toast.LENGTH_LONG).show()

        if(data2 != "") {
            AlertDialog.Builder(this).run{
                setTitle("임시저장")
                setIcon(android.R.drawable.ic_dialog_info)
                setMessage("이전 상태를 돌려올까요? 내용: ${data2}")
                setPositiveButton("Yes"){dialog, id->
//"예" 버튼 클릭시 실행하는 메소드
                    viewbinding.editText.setText("${data2}")
                }
                setNegativeButton("No"){dialog, id->
//"예" 버튼 클릭시 실행하는 메소드
                    viewbinding.editText.setText("")
                }
                    .show()
            }
        }
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_LONG).show()
    }
    var data2 = ""

    constructor(parcel: Parcel) : this() {
        data2 = parcel.readString()
    }

    override fun onPause() {
        super.onPause()
        data2 = viewbinding.editText.getText().toString()
        Toast.makeText(applicationContext, "${data2}", Toast.LENGTH_LONG).show()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(data2)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MemoActivity> {
        override fun createFromParcel(parcel: Parcel): MemoActivity {
            return MemoActivity(parcel)
        }

        override fun newArray(size: Int): Array<MemoActivity?> {
            return arrayOfNulls(size)
        }
    }
}*/