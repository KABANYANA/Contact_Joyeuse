package com.example.contact_joyeuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact_joyeuse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        displayContact()

    }
    fun displayContact(){
        var contact1=ContactData("","Joy","0787520385",
            "joyeuse@gmail.com")

        var contact2=ContactData("","Joel","075434345",
            "joel@gmail.com")
        var contact3=ContactData("","Faith","0784567345",
            "faith@gmail.com")
        var contact4=ContactData("","Landrada","0897646345",
            "joyeuse@gmail.com")
        var contact5=ContactData("","Joan","0722377567",
            "joannjiru@gmail.com")
        var contact6=ContactData("","Joy","0787520385",
            "joyeuse@gmail.com")

        var contact7=ContactData("","Joel","075434345",
            "joel@gmail.com")
        var contact8=ContactData("","Faith","0784567345",
            "faith@gmail.com")
        var contact9=ContactData("","Landrada","0897646345",
            "joyeuse@gmail.com")
        var contact10=ContactData("","Joan","0722377567",
            "joannjiru@gmail.com")
        var theContactList= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactsAdapter=ContactRvAdapter(theContactList)
        binding.rvContacts.adapter=contactsAdapter

    }
}