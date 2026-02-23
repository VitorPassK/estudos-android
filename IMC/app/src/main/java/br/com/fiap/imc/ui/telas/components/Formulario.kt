package br.com.fiap.imc.ui.telas.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.imc.ui.theme.IMCTheme

@Composable
fun Formulario (modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
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
            value = "",
            onValueChange = {},
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
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
            .fillMaxWidth()
        ) {

            Button(
                onClick = {}

            ) {
                Text(
                    text = "LIMPAR"
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {}

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