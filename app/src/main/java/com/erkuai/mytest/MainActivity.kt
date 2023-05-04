package com.erkuai.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val adapter = MyAdapter()
//        adapter.notifyItemMoved()

        test()
    }



    private fun test() {
        var i = 0
        var a = i++
        var b = ++i
        Log.i("wmkwmk", "test: i--$i,a--$a,b--$b")
    }

    fun showLog(view: View) {
        JavaFile().showLog(null)
    }

//    class MyAdapter :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        }
//
//        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        }
//
//        override fun getItemCount(): Int {
//        }
//
//        override fun onViewAttachedToWindow(holder: RecyclerView.ViewHolder) {
//            super.onViewAttachedToWindow(holder)
//        }
//
//        override fun onViewDetachedFromWindow(holder: RecyclerView.ViewHolder) {
//            super.onViewDetachedFromWindow(holder)
//        }
//
//    }
}