package com.ahmed.banquemisrapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmed.banquemisrapp.ui.theme.BanqueMisrAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanqueMisrAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    var usernameField = rememberTextFieldState()
    var password = rememberTextFieldState()
    val isButtonEnabled = usernameField.text.isNotEmpty() && password.text.isNotEmpty()
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp)
    ) {
        Header(
            Modifier
                .fillMaxWidth()
                .padding(top = 72.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 58.dp)
                .padding(horizontal = 8.dp),
        ) {
            UsernameTextField(
                state = usernameField,
                modifier = Modifier
                    .fillMaxWidth()
            )
            PasswordTextField(
                state = password,
                modifier
                    .fillMaxWidth()
            )
            ForgotPasswordText() {
                Toast.makeText(context, "Go to Forgot Password", Toast.LENGTH_SHORT).show()
            }
            LoginButton(isButtonEnabled)
            ContactUSText()
        }
        Footer()
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}

