package dev.queenter.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.queenter.fibonacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacci()

    }

    fun fibonacci() {
        var firstNum = 0
        var nextNum = 1
        var numbers = mutableListOf<Int>()

        for (i in 1..100) {
            numbers.add(firstNum)
            val sum = firstNum + nextNum
            firstNum = nextNum
            nextNum = sum
        }

            var numberAdapter = NumberRecyclerViewAdapter(numbers)
            binding.rvNum.layoutManager = LinearLayoutManager(this)
            binding.rvNum.adapter = numberAdapter

    }


    }


