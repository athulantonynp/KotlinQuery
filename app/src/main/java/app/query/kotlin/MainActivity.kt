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
        query=useQuery("test-key") { setData() }

        //Destructed way
        val (isExecuting,result)=useQuery("test-key-2"){setData()}

    }

    fun  setData():String{

        Thread.sleep(3000)
        return "Hello KotlinQuery ${System.currentTimeMillis()}"
    }
}