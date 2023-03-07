package uz.itschool

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import uz.itschool.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var foods = mutableListOf<Food>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        foods.add(Food("Burgers", R.drawable.burgers, Color.parseColor("#FFEF92")))
        foods.add(Food("Fries", R.drawable.fries, Color.parseColor("#F5CAC3")))
        foods.add(Food("Soda", R.drawable.soda, Color.parseColor("#B6D7CF")))
        foods.add(Food("Burgers", R.drawable.burgers, Color.parseColor("#F5CAC3")))
        foods.add(Food("Burgers", R.drawable.burgers, Color.parseColor("#B6D7CF")))


        binding.rv1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapter = CategoryAdapter(foods)
        binding.rv1.adapter = adapter
    }
}