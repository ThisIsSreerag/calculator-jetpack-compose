package com.emsyne.calculatorjetpackcompose.ui.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.emsyne.calculatorjetpackcompose.ui.theme.CalculatorJetpackComposeTheme
import com.emsyne.calculatorjetpackcompose.utils.Calculator

class CalculatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorJetpackComposeTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                Calculator(state = state, onAction = viewModel::onAction)
            }
        }
    }
}

