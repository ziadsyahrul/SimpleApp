package com.ziadsyahrul.simpleapp.response

import com.google.gson.annotations.SerializedName

data class ArtisanResponse(

	@field:SerializedName("ArtisanResponse")
	val artisanResponse: List<ArtisanResponseItem>
)

data class ArtisanResponseItem(

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("user_image")
	val userImage: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rating")
	val rating: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("avatar")
	val avatar: String,

	@field:SerializedName("services")
	val services: List<ServicesItem>,

	@field:SerializedName("id")
	val id: String
)

data class ServicesItem(

	@field:SerializedName("price")
	val price: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("caption")
	val caption: String
)
