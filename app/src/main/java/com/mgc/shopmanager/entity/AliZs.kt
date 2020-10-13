package com.mgc.shopmanager.entity

import androidx.room.*

@Entity(tableName = "users")
data class AliZs(
    @ColumnInfo(name = "user_account") val account: String // 账号
    , @ColumnInfo(name = "user_pwd") val pwd: String // 密码
    , @ColumnInfo(name = "user_name") val name: String
    , @Embedded val address: String // 地址
    , @Ignore val state: Int // 状态只是临时用，所以不需要存储在数据库中
) {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}