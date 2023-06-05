package com.example.contact_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact_list.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
        displayContacts()

    }
    fun displayContacts(){

        var name1 =ContactsData("marrisa","0745980765","marrisa@gmail.com","")
        var name2 =ContactsData(" Batoto","0789567890","batoto@gmail.com","")
        var name3=ContactsData("Annete ","07457687989","annnete@gmail.com","")
        var name4=ContactsData(" Mercy","0789678945","mercy@gmail.com","")
        var name5 =ContactsData("Faith","07896789","faith@gmail.com","")
        var names = listOf(name1,name2,name3,name4,name5)
        val contactAdapter=ContactRVAdapter(names)
        binding.rvAdapter.layoutManager =LinearLayoutManager(this)
        binding.rvAdapter.adapter= contactAdapter

    }
}