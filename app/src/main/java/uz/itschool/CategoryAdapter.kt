package uz.itschool

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(var foods: MutableList<Food>) :
    RecyclerView.Adapter<CategoryAdapter.MyHolder>() {
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val back: CardView = itemView.findViewById(R.id.card)
        val image: ImageView = itemView.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.menu, parent, false))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val food = foods[position]
        holder.name.text = food.name
        holder.image.setImageResource(food.image)
        holder.back.setCardBackgroundColor(food.fon)
    }

    override fun getItemCount(): Int {
        return foods.size
    }
}