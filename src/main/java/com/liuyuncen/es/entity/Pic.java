package com.liuyuncen.es.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @belongsProject: xisai-subject-boot
 * @belongsPackage: com.liuyuncen.es.entity
 * @author: Xiang想
 * @createTime: 2024-07-11  17:44
 * @description: TODO
 * @version: 1.0
 */
@Table("s_pic")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pic {

    @Id(keyType = KeyType.Auto)
    private Long id;
    private String picUrl;
}
