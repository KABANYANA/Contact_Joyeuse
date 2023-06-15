package com.example.contact_joyeuse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_joyeuse.databinding.ActivityMainBinding
import com.example.contact_joyeuse.databinding.ContactItemListBinding
import com.squareup.picasso.Picasso


class ContactRvAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contacts = contactList[position]
//
        var binding=holder.binding
            binding.tvName.text =contacts.contactName
            binding.tvPhoneNumber.text=contacts.phoneNumber
            binding.tvEmail.text=contacts.Email
            Picasso
                .get()
                .load(contacts.img)
                .resize(130,130)
//                .centerCrop()
                .into(binding.ivContact)

        }


    override fun getItemCount(): Int {
        return contactList.size
    }
}

class  ContactViewHolder(var binding: ContactItemListBinding):RecyclerView.ViewHolder(binding.root){

}