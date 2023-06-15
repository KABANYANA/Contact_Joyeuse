package com.example.contact_joyeuse

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.example.contact_joyeuse.databinding.ActivityMainBinding

class ActivityAddContact: AppCompatActivity() {
    lateinit var binding: ActivityAddContact
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContact().inflate(layoutInflater)
        setContentView( binding.root)


    }

    override fun onResume() {
        super.onResume()
        validateRegisterContacts()
        clearErrorOnType()
    }

    fun clearErrorOnType() {

        binding.etName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
        binding.etPhoneNumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPhoneNumber.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
        binding.etEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }


    fun validateRegisterContacts() {
        val name = binding.etName.text.toString()
        val contacts = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()

        var error = false
        if (name.isBlank()) {
            binding.tilName.error = "name is required"
            error = true
        }

        if (contacts.isBlank()) {
            binding.tilPhoneNumber.error = "contacts is required"
            error = true
        }

        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }


        if (!error) {
            Toast.makeText(this, "$name,$contacts, $email", Toast.LENGTH_LONG).show()
        }

    }
}


