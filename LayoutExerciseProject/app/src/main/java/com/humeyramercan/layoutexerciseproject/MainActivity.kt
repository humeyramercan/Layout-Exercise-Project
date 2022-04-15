package com.humeyramercan.layoutexerciseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.humeyramercan.layoutexerciseproject.databinding.ActivityMainBinding
import com.humeyramercan.layoutexerciseproject.databinding.ActivityStartBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.startNowButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.startNowButton.id ->{
                val intent=Intent(this@MainActivity,StartActivity::class.java)
                startActivity(intent)
            }
        }
    }
}