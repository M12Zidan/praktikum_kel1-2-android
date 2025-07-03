package com.app.praktikum_kel1_2.model.response

/**
 * Representasi response dari server setelah proses registrasi pengguna selesai.
 *
 * @property message Pesan status dari server (contoh: "Registrasi berhasil").
 * @property user Informasi pengguna yang baru saja berhasil didaftarkan.
 */
data class RegisterResponse(
    val message: String,
    val user: RegisterUser
)

/**
 * Informasi pengguna yang baru saja berhasil diregistrasi.
 *
 * @property id ID unik pengguna yang dibuat oleh sistem.
 * @property email Alamat email pengguna.
 * @property username Nama pengguna yang digunakan untuk login ke dalam sistem.
 */
data class RegisterUser(
    val id: String,
    val email: String,
    val username: String
)
