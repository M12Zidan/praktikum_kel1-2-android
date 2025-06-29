package com.app.praktikum_kel1_2.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.app.praktikum_kel1_2.navigation.Screen

/**
 * Composable `HomeScreen` menampilkan halaman utama berisi input nama
 * dan tombol untuk navigasi ke halaman hasil (`ResultScreen`).
 *
 * @param navController controller navigasi untuk berpindah ke halaman berikutnya.
 */
@Composable
fun HomeScreen(navController: NavController) {
    // State untuk menyimpan input teks dari pengguna
    var text by remember { mutableStateOf("") }

    // Box digunakan untuk menempatkan elemen di tengah layar
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Kolom vertikal berisi teks label, input field, dan tombol
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Masukkan Nama:") // Label untuk input
            TextField(
                value = text,
                onValueChange = { text = it },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Tombol untuk menavigasi ke halaman Result dengan parameter nama
            Button(onClick = {
                navController.navigate(route = Screen.Result.passText(text))
            }) {
                Text("Submit")
            }
        }
    }
}

/**
 * Preview `HomeScreen` untuk ditampilkan di Android Studio Preview.
 * Menggunakan dummy NavController untuk kebutuhan preview.
 */
@Preview(showBackground = true)
@Composable
fun HomeScreenView() {
    HomeScreen(
        navController = rememberNavController()
    )
}
