package com.example.contact_joyeuse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact_joyeuse.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.fabAddContact.setOnClickListener {
            val intent = Intent(this,ActivityAddContact::class.java)
            startActivity(intent)
        }

    }


    override fun onResume() {
        super.onResume()
        displayContact()

    }

    fun displayContact(){
        var contact1=ContactData("https://images.unsplash.com/photo-1523824921871-d6f1a15151f1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NzF8fGFmcmljYW4lMjBwcm9maWxlJTIwcGljdHVyZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Joy","0787520385",
            "joyeuse@gmail.com")

        var contact2=ContactData("https://images.unsplash.com/photo-1523824921871-d6f1a15151f1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NzF8fGFmcmljYW4lMjBwcm9maWxlJTIwcGljdHVyZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Joel","075434345",
            "joel@gmail.com")
        var contact3=ContactData("https://images.unsplash.com/photo-1542727313-4f3e99aa2568?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Faith","0784567345",
            "faith@gmail.com")
        var contact4=ContactData("https://images.unsplash.com/photo-1606914707708-5180546f153d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=388&q=80","Landrada","0897646345",
            "joyeuse@gmail.com")
        var contact5=ContactData("https://images.unsplash.com/photo-1533636721434-0e2d61030955?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjh8fGFmcmljYW4lMjBwcm9maWxlJTIwcGljdHVyZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Joan","0722377567",
            "joannjiru@gmail.com")
        var contact6=ContactData("https://images.unsplash.com/photo-1589707181684-24a34853641d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDB8fGFmcmljYW4lMjBwcm9maWxlJTIwcGljdHVyZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Joy","0787520385",
            "joyeuse@gmail.com")

        var contact7=ContactData("https://images.unsplash.com/photo-1562964400-f8ec1ef25777?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTF8fGFmcmljYW4lMjBwcm9maWxlJTIwcGljdHVyZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Joel","075434345",
            "joel@gmail.com")
        var contact8=ContactData("https://images.unsplash.com/photo-1504376379689-8d54347b26c6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Njl8fGFmcmljYW4lMjBwcm9maWxlJTIwcGljdHVyZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Faith","0784567345",
            "faith@gmail.com")
        var contact9=ContactData("https://images.unsplash.com/photo-1507514217837-da7e39d37edd?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nzh8fGFmcmljYW4lMjBwcm9maWxlJTIwcGljdHVyZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Landrada","0897646345",
            "joyeuse@gmail.com")
        var contact10=ContactData("https://images.unsplash.com/photo-1523824921871-d6f1a15151f1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NzF8fGFmcmljYW4lMjBwcm9maWxlJTIwcGljdHVyZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Joan","0722377567",
            "joannjiru@gmail.com")
        var theContactList= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactsAdapter=ContactRvAdapter(theContactList)
        binding.rvContacts.adapter=contactsAdapter

    }
}