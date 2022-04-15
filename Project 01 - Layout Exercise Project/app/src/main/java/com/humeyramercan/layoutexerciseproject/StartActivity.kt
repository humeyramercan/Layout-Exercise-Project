package com.humeyramercan.layoutexerciseproject

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannedString
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.databinding.DataBindingUtil
import com.humeyramercan.layoutexerciseproject.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {
   private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_start)

        binding.signInButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.signInButton.id ->{
                val intent= Intent(this@StartActivity,PremiumActivity::class.java)
                startActivity(intent)
            }
        }
    }
}