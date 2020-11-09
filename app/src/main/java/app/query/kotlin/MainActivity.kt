package app.query.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import app.query.kotlin.query.data.QueryData
import app.query.kotlin.query.useQuery

class MainActivity : AppCompatActivity() {
    lateinit var query:QueryData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Destructed way
        val (isExecuting,result)=useQuery<String>("test-two",item)

    }

    val item=fun():String{
        Thread.sleep(3000)
        return  ""
    }
}