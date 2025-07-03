package com.app.praktikum_kel1_2.model.response

/**
 * Representasi response dari server setelah proses login berhasil atau gagal.
 *
 * @property code Kode status HTTP dari server (contoh: 200 untuk sukses).
 * @property message Pesan deskriptif dari hasil login (contoh: "Login berhasil").
 * @property data Informasi pengguna yang berhasil login, jika tersedia.
 * @property token Token autentikasi yang diberikan server untuk sesi pengguna.
 */
data class LoginResponse(
    val code: Int,
    val message: String,
    val data: LoginData?,
    val token: String?
)

/**
 * Informasi pengguna yang dikembalikan setelah proses login berhasil.
 *
 * @property uuid ID unik pengguna (biasanya digunakan sebagai identifikasi global).
 * @property fullName Nama lengkap pengguna.
 */
data class LoginData(
    val uuid: String,
    val fullName: String
)
