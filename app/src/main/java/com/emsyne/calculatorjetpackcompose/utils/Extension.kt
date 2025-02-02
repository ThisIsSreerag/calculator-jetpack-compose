package com.emsyne.calculatorjetpackcompose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emsyne.calculatorjetpackcompose.ui.calculator.CalculatorAction
import com.emsyne.calculatorjetpackcompose.ui.calculator.CalculatorState
import com.emsyne.calculatorjetpackcompose.ui.theme.BattleShipGray
import com.emsyne.calculatorjetpackcompose.R
import com.emsyne.calculatorjetpackcompose.ui.calculator.CalculatorOperation
import com.emsyne.calculatorjetpackcompose.ui.theme.OrangePeel
import com.emsyne.calculatorjetpackcompose.ui.theme.Thunder

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    backgroundColor: Color,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp))
            .background(backgroundColor)
            .clickable {
                onClick()
            }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            fontSize = 24.sp,
            color = Color.White
        )
    }
}

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.DarkGray,
                maxLines = 2

            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = stringResource(R.string.clear),
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    backgroundColor = BattleShipGray,
                ) {
                    onAction(CalculatorAction.Clear)
                }
                CalculatorButton(
                    symbol = stringResource(R.string.delete),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = BattleShipGray,
                ) {
                    onAction(CalculatorAction.Delete)
                }
                CalculatorButton(
                    symbol = stringResource(R.string.division),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = OrangePeel,
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Division))
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = stringResource(R.string.seven),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(7))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.eight),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(8))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.nine),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(9))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.multiplication),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = OrangePeel,
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Multiplication))
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = stringResource(R.string.four),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(4))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.five),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(5))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.six),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(6))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.subtraction),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = OrangePeel,
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Subtraction))
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = stringResource(R.string.one),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(1))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.two),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(2))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.three),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(3))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.addition),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = OrangePeel,
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Addition))
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = stringResource(R.string.zero),
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Number(0))
                }
                CalculatorButton(
                    symbol = stringResource(R.string.decimal),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = Thunder,
                ) {
                    onAction(CalculatorAction.Decimal)
                }
                CalculatorButton(
                    symbol = stringResource(R.string.equal),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    backgroundColor = OrangePeel,
                ) {
                    onAction(CalculatorAction.Calculate)
                }
            }
        }
    }
}