package com.example.tomjangtestgg.habittrainer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(val habits: List<Habit>) :RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>(){

    class HabitViewHolder(val card : View) : RecyclerView.ViewHolder(card)

    // insert data in a card view(single_card)
    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        if (holder != null){
            val habit = habits[position]
            holder.card.tv_title.text = habit.title
            holder.card.tv_description.text = habit.description
            holder.card.iv_icon.setImageResource(habit.image)
        }
    }

    // add view holder (in recycler view, insert card view(single_card))
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) :HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card,parent,false)
        return HabitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return habits.size
    }

}