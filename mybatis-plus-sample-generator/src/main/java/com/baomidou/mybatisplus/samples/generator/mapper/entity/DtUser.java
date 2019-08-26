package com.baomidou.mybatisplus.samples.generator.mapper.entity;

import com.baomidou.mybatisplus.samples.generator.common.BaseEntity;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yufc
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class DtUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long userSerial;

    private String userNo;

    private String userLname;

    private String userFname;

    private String depNo;

    private Integer userDep;

    private String userDepname;

    private LocalDateTime userWorkday;

    private String userDuty;

    private String userCard;

    private String userFinger;

    private String userPassword;

    private LocalDateTime pwdBegin;

    private LocalDateTime pwdEnd;

    private Integer userType;

    private LocalDateTime pactBegin;

    private LocalDateTime pactEnd;

    private Integer userLevel;

    private Integer userPhoto;

    private String userSex;

    private String userNation;

    private String userXueli;

    private String userNative;

    private LocalDateTime userBirthday;

    private String userId;

    private String userPost;

    private String userLinkman;

    private String userTelephone;

    private String userAddress;

    private String userEmail;

    private String user1;

    private String user2;

    private String userBz;

    private String kqRule;

    private String kqTaoban;

    private Integer kqTiaoxiu;

    private LocalDateTime xfTime;

    private Integer xfJiange;

    private Integer xfJe;

    private LocalDateTime userSj;

    private String userRank;

    private Integer glyImg;

    private Integer userAc;

    private String userGsbh;

    private String userYglx;

    private String userZhbh;

    private String userZhlx;

    private String userTxm;

    private Integer userLx;

    private Integer userMj;

    private String depNoAdd;

    private String zh;

    private String khsj;

    private String deptName;

    private String bigDeptId;

    private String bigDeptName;

    private String absenteeismRateId;

    private String absenteeismRateName;

    private String jobName;

    private String bsid;

    private String userPosition;

    private String psw;

    private String position;

    private String attmStartDate;

    private String attmEndDate;

    private String workStartDate;

    private String workEndDate;

    private String calendarType;

    private String jobClassificatio;

    private String foreignName;

    private String companyCode;

    private String companyName;

    private String isManager;

    private String positionCode;

    private String areaAccount;

    private String endWorkDate;

    private String identityId;

    private String isOutsourcing;

    private Integer userIdentity;

    private Integer userFace;

    private String gscbzx;

    private String costCenter;

    private String workLocation;

    private String businessArea;

    @TableField("businessArea")
    private String businessArea;

    @TableField("legalEntity")
    private String legalEntity;

    @TableField("workLocation")
    private String workLocation;

    private String smtPhoto;


}
