package br.com.fiap.imc.ui.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.imc.ui.telas.components.Formulario
import br.com.fiap.imc.ui.telas.components.Titulo
import br.com.fiap.imc.ui.theme.IMCTheme

@Composable
fun TelaImc(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(color = 0xFFC0DFE5))
    ){
        Column{
            Titulo(texto = "El Puesto")
            Formulario()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaImcPreview(){
    IMCTheme{
        TelaImc()
    }
}