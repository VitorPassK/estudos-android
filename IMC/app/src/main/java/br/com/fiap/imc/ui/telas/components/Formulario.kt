package br.com.fiap.imc.ui.telas.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.imc.ui.theme.IMCTheme
import androidx.compose.runtime.*

@Composable
fun Formulario (modifier: Modifier = Modifier){

    var pesoNovo by remember {
        mutableStateOf("")
    }

    var pneuNovo by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                vertical = 16.dp,
                horizontal = 32.dp)
    ) {
        OutlinedTextField(
            value = pesoNovo,
            onValueChange = {
                pesoNovo = it
            },
            label = {
                Text(
                    text = "Digite seu peso em toneladas"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = pneuNovo,
            onValueChange = {
                pneuNovo = it
            },
            label = {
                Text(
                    text = "Digite a largura de seu pneu"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .background(Color.Transparent)
        ) {

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(start = 2.dp)
                    .weight(1f),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0XFFFF9800),
                    contentColor = Color.White
                )

            ) {
                Text(
                    text = "LIMPAR"
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(end = 2.dp)
                    .weight(1f),
                shape = RoundedCornerShape(8.dp)


            ) {
                Text(
                    text = "CALCULAR"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FormularioPreview(){
    IMCTheme() {
        Formulario()
    }
}