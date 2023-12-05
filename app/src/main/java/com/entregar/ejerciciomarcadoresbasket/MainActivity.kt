package com.entregar.ejerciciomarcadoresbasket

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.entregar.ejerciciomarcadoresbasket.ui.theme.EjercicioMarcadoresBasketTheme

class MainActivity : ComponentActivity() {
    private var contadorLocal = 0
    private var contadorFaltasLocal = 0
    private var contadorVisitante = 0
    private var contadorFaltasVisitante = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // CONTADOR-LOCAL:
        //referencia al marcadorResultadoLocal
        val marcadorResultadoLocal = findViewById<TextView>(R.id.marcadorResultadoLocal)

        //inicializamos el marcadorResultadoLocal con el contadorLocal a 0
        marcadorResultadoLocal.setText(contadorLocal.toString())

        //creamos las variables para los botones de sumar y restar
        val buttonLocalSumar1 = findViewById<Button>(R.id.buttonLocalSumar1)
        val buttonLocalSumar2 = findViewById<Button>(R.id.buttonLocalSumar2)
        val buttonLocalSumar3 = findViewById<Button>(R.id.buttonLocalSumar3)
        val buttonLocalRestar1 = findViewById<Button>(R.id.buttonLocalRestar1)

        //asociaciamos una expresión lambda como respuesta(callback) al evento Clic sobre los botones:
        //botón de sumar 1
        buttonLocalSumar1.setOnClickListener {
            contadorLocal++
            marcadorResultadoLocal.setText(contadorLocal.toString())
        }

        //botón de sumar 2
        buttonLocalSumar2.setOnClickListener {
            contadorLocal = contadorLocal + 2
            marcadorResultadoLocal.setText(contadorLocal.toString())
        }

        //botón de sumar 3
        buttonLocalSumar3.setOnClickListener {
            contadorLocal = contadorLocal + 3
            marcadorResultadoLocal.setText(contadorLocal.toString())
        }

        //botón de restar 1
        buttonLocalRestar1.setOnClickListener {
            contadorLocal--
            marcadorResultadoLocal.setText(contadorLocal.toString())
        }

        //FALTAS-LOCAL
        //referencia al textViewFaltasLocal
        val marcadorFaltasLocal = findViewById<TextView>(R.id.marcadorFaltasLocal)

        //inicializamos el textViewFaltasLocal con el contadorFaltasLocal a 0
        marcadorFaltasLocal.setText(contadorFaltasLocal.toString())

        //creamos las variables para los botones de sumar, restar y poner a cero
        val buttonFaltasLocalSumar1 = findViewById<Button>(R.id.buttonFaltasLocalcSumar1)
        val buttonFaltasLocalRestar1 = findViewById<Button>(R.id.buttonFaltasLocalRestar1)
        val buttonFaltasLocalToCero = findViewById<Button>(R.id.buttonFaltasLocalToCero)

        //asociaciamos una expresión lambda como respuesta (callback) al evento Clic sobre los botones:
        //botón de sumar 1 falta
        buttonFaltasLocalSumar1.setOnClickListener {
            contadorFaltasLocal++
            marcadorFaltasLocal.setText(contadorFaltasLocal.toString())
        }

        //botón de restar 1 falta
        buttonFaltasLocalRestar1.setOnClickListener {
            contadorFaltasLocal--
            marcadorFaltasLocal.setText(contadorFaltasLocal.toString())
        }

        //botón de poner a 0
        buttonFaltasLocalToCero.setOnClickListener {
            contadorFaltasLocal = 0
            marcadorFaltasLocal.setText(contadorFaltasLocal.toString())
        }














        // CONTADOR-VISITANTE:
        //referencia al textViewResultadoLocal
        val marcadorResultadoVisitante = findViewById<TextView>(R.id.marcadorResultadoVisitante)

        //inicializamos el textViewResultadoLocal con el contadorLocal a 0
        marcadorResultadoVisitante.setText(contadorVisitante.toString())

        //creamos las variables para los botones de sumar y restar
        val buttonVisitanteSumar1 = findViewById<Button>(R.id.buttonVisitanteSumar1)
        val buttonVisitanteSumar2 = findViewById<Button>(R.id.buttonVisitanteSumar2)
        val buttonVisitanteSumar3 = findViewById<Button>(R.id.buttonVisitanteSumar3)
        val buttonVisitanteRestar1 = findViewById<Button>(R.id.buttonVisitanteRestar1)

        //asociaciamos una expresión lambda como respuesta (callback) al evento Clic sobre los botones:
        //botón de sumar 1
        buttonVisitanteSumar1.setOnClickListener {
            contadorVisitante++
            marcadorResultadoVisitante.setText(contadorVisitante.toString())
        }

        //botón de sumar 2
        buttonVisitanteSumar2.setOnClickListener {
            contadorVisitante = contadorVisitante + 2
            marcadorResultadoVisitante.setText(contadorVisitante.toString())
        }

        //botón de sumar 3
        buttonVisitanteSumar3.setOnClickListener {
            contadorVisitante = contadorVisitante + 3
            marcadorResultadoVisitante.setText(contadorVisitante.toString())
        }

        //botón de restar 1
        buttonVisitanteRestar1.setOnClickListener {
            contadorVisitante--
            marcadorResultadoVisitante.setText(contadorVisitante.toString())
        }

        //FALTAS-VISITANTE
        //referencia al textViewFaltasVisitante
        val marcadorFaltasVisitante = findViewById<TextView>(R.id.marcadorFaltasVisitante)

        //inicializamos el textViewFaltasLocal con el contadorFaltasLocal a 0
        marcadorFaltasVisitante.setText(contadorFaltasVisitante.toString())

        //creamos las variables para los botones de sumar, restar y poner a cero
        val buttonFaltasVisitanteSumar1 = findViewById<Button>(R.id.buttonFaltasVisitanteSumar1)
        val buttonFaltasVisitanteRestar1 = findViewById<Button>(R.id.buttonFaltasVisitanteRestar1)
        val buttonFaltasVisitanteToCero = findViewById<Button>(R.id.buttonFaltasVisitanteToCero)

        //asociaciamos una expresión lambda como respuesta (callback) al evento Clic sobre los botones:
        //botón de sumar 1 falta
        buttonFaltasVisitanteSumar1.setOnClickListener {
            contadorFaltasVisitante++
            marcadorFaltasVisitante.setText(contadorFaltasVisitante.toString())
        }

        //botón de restar 1 falta
        buttonFaltasVisitanteRestar1.setOnClickListener {
            contadorFaltasVisitante--
            marcadorFaltasVisitante.setText(contadorFaltasVisitante.toString())
        }

        //botón de poner a 0
        buttonFaltasVisitanteToCero.setOnClickListener {
            contadorFaltasVisitante = 0
            marcadorFaltasVisitante.setText(contadorFaltasVisitante.toString())
        }






        //RESET ALL TEXT VIEW
        //creamos la variable para el boton de poner todos los marcadores a cero
        val buttonReset = findViewById<Button>(R.id.buttonReset)

        //botón para poner todos los marcadores a cero
        buttonReset.setOnClickListener {
            contadorLocal = 0
            contadorFaltasLocal = 0
            contadorVisitante = 0
            contadorFaltasVisitante = 0

            marcadorResultadoLocal.setText(contadorLocal.toString())
            marcadorFaltasLocal.setText(contadorFaltasLocal.toString())

            marcadorResultadoVisitante.setText(contadorVisitante.toString())
            marcadorFaltasVisitante.setText(contadorFaltasVisitante.toString())
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjercicioMarcadoresBasketTheme {
        Greeting("Android")
    }
}