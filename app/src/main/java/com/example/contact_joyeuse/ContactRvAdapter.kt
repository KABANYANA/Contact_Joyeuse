package com.example.contact_joyeuse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_joyeuse.databinding.ActivityMainBinding
import com.example.contact_joyeuse.databinding.ContactItemListBinding


class ContactRvAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contacts = contactList[position]
        holder.binding.apply {
            tvName.text =contacts.contactName
            tvPhoneNumber.text=contacts.phoneNumber
            tvEmail.text=contacts.Email
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class  ContactViewHolder(var binding: ContactItemListBinding):RecyclerView.ViewHolder(binding.root){

}