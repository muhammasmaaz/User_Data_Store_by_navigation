package com.example.user_data_store_by_navigation

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.user_data_store_by_navigation.databinding.FragmentUserEducationBinding
import com.example.user_data_store_by_navigation.databinding.FragmentUserExperienceBinding


class UserExperienceFragment : Fragment() {


    private lateinit var binding: FragmentUserExperienceBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentUserExperienceBinding.inflate(inflater,container,false)


        binding.apply {
            binding.btnNextUserexperience.setOnClickListener {

                if (TextUtils.isEmpty(etCompanyName.text.toString())|| TextUtils.isEmpty(etDesignation.text.toString())|| TextUtils.isEmpty(etExperience.text.toString())) {

                    Toast.makeText(context,"Must be filled",Toast.LENGTH_SHORT).show()
                }else {
                    Toast.makeText(context, "Succes", Toast.LENGTH_SHORT).show()
                }
            }

        }
        return binding.root

    }


}