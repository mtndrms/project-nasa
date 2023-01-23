package com.metin.projectnasa.common

object Constants {
    const val NASA_API_BASE_URL = "https://api.nasa.gov/mars-photos/api/v1/rovers/"
    const val API_KEY = "DEMO_KEY"
    const val NO_LIMIT_API_BASE_URL = "http://mars-photos.herokuapp.com/api/v1/rovers/"

    const val DEFAULT_SOL_VALUE = 1000
    const val MAX_SOL_CURIOSITY = 3718
    const val MAX_SOL_OPPORTUNITY = 5111
    const val MAX_SOL_SPIRIT = 2208

    val rovers = listOf("Curiosity", "Opportunity", "Spirit")

    val allCameras =
        listOf("FHAZ", "RHAZ", "MAST", "CHEMCAM", "MAHLI", "MARDI", "NAVCAM", "PANCAM", "MINITES")
    val cameraTypesCuriosity = listOf("FHAZ", "RHAZ", "MAST", "CHEMCAM", "MAHLI", "MARDI", "NAVCAM")
    val cameraTypesOpportunity = listOf("FHAZ", "RHAZ", "NAVCAM", "PANCAM", "MINITES")
    val cameraTypesSpirit = listOf("FHAZ", "RHAZ", "NAVCAM", "PANCAM", "MINITES")
}