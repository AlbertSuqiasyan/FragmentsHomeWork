package com.example.homework


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.homework.databinding.FragmentRegistrationBinding
import kotlinx.android.synthetic.main.fragment_registration.view.*


class RegistrationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
       val binding = DataBindingUtil.inflate<FragmentRegistrationBinding>(inflater,R.layout.fragment_registration,false)
        binding.loginButton.setOnClickListener(view: View -> view.findNavController().navigate(R.id.))
        return binding.root
    }
}
