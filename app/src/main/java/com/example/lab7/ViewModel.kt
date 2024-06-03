package com.example.lab7

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration : Int,
    val releaseDate : String,
    val genre : String,
    val shotDescription : String
) {
    companion object {
        fun getSampleMovies(): MutableList<Movie> {
            val listMovie = mutableListOf<Movie>()
            listMovie.add(Movie("Kẻ Ẩn Danh", "2024", "https://assets2.htv.com.vn/Images/.NEWZ/09.2023/01/LANH/Screenshot%202023-09-01%20202642.png", 120, "2024", "Hành Động", "abc abc"))
            listMovie.add(Movie("Ngôi Đền Kỳ Quái 3", "2021", "https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2022/4/15/1034450/Peenak3-Main_Poster_.jpg", 120, "2024", "Hành Động", "abc abc"))
            listMovie.add( Movie("Lật Mặt 6", "2023", "https://image.bnews.vn/MediaUpload/Org/2023/04/24/lm6-2x3-layout-20230424144523.jpg", 120, "2024", "Hành Động", "abc abc"))
            return listMovie
        }
    }
}