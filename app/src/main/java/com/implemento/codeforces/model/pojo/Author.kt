package com.implemento.codeforces.model.pojo


import com.google.gson.annotations.SerializedName

data class Author(
    @SerializedName("contestId")
    val contestId: Int,
    @SerializedName("ghost")
    val ghost: Boolean,
    @SerializedName("members")
    val members: List<Member>,
    @SerializedName("participantType")
    val participantType: String,
    @SerializedName("room")
    val room: Int,
    @SerializedName("startTimeSeconds")
    val startTimeSeconds: Int
)