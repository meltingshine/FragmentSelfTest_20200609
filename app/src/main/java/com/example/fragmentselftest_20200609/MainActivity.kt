package com.example.fragmentselftest_20200609

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentselftest_20200609.adapters.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var myAdapter : MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        myAdapter = MyAdapter(supportFragmentManager)
        myViewPager.adapter = myAdapter
//
//        탭레이아웃과 뷰페이저를 연결
        myTabLayout.setupWithViewPager(myViewPager)
    }

}
