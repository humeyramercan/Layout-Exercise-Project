package com.humeyramercan.layoutexerciseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.humeyramercan.layoutexerciseproject.databinding.ActivityPremiumBinding

class PremiumActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityPremiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_premium)
        binding.goPremiumButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.goPremiumButton.id->{
                val intent= Intent(this@PremiumActivity,MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }
        }
    }
}