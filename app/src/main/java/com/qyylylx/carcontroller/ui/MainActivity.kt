package com.qyylylx.carcontroller.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.qyylylx.carcontroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Forward.setOnClickListener {  }
        binding.Backward.setOnClickListener {  }
        binding.Left.setOnClickListener {  }
        binding.Right.setOnClickListener {  }
        binding.Stop.setOnClickListener {  }
        //目前速度和时间的设置框被设置为不可见，后续版本会添加相应功能
        // TODO: 2021/11/19 实现蓝牙发送string指令
        // TODO: 2021/11/19 长按发送一次，松手停止（监听松手事件）
        // TODO: 2021/11/19 将发送指令功能封装到仓库层
    }
}