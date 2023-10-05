package com.vladimirorlov9.airnettest.ui.requestscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.vladimirorlov9.airnettest.databinding.FragmentRequestBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RequestFragment : Fragment() {

    private var _binding: FragmentRequestBinding? = null
    private val binding get() = _binding!!

    private val vm by viewModel<RequestViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRequestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.initToolbar()

    }

    private fun FragmentRequestBinding.initToolbar() {
        this.toolbar.setupWithNavController(findNavController())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}