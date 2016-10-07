package com.jaiky.test.faceview;

import android.util.SparseIntArray;

/**
 * Author by Jaiky, Email jaikydota@163.com, Date on 10/12/2014.
 * PS: Not easy to write code, please indicate.
 */
public class FaceManager {
    private static FaceManager ourInstance;

    public static FaceManager getInstance() {
        if (ourInstance == null)
            ourInstance = new FaceManager();
        return ourInstance;
    }

    private SparseIntArray faceMap = null;

    public int getFace(int faceNum){
        return  faceMap.get(faceNum);
    }

    private FaceManager() {
        faceMap = new SparseIntArray();
        faceMap.append(0, R.drawable.face_0);
        faceMap.append(1, R.drawable.face_1);
        faceMap.append(2, R.drawable.face_2);
        faceMap.append(3, R.drawable.face_3);
        faceMap.append(4, R.drawable.face_4);
        faceMap.append(5, R.drawable.face_5);
        faceMap.append(6, R.drawable.face_6);
        faceMap.append(7, R.drawable.face_7);
        faceMap.append(8, R.drawable.face_8);
        faceMap.append(9, R.drawable.face_9);
        faceMap.append(10, R.drawable.face_10);
        faceMap.append(11, R.drawable.face_11);
        faceMap.append(12, R.drawable.face_12);
        faceMap.append(13, R.drawable.face_13);
        faceMap.append(14, R.drawable.face_14);
        faceMap.append(15, R.drawable.face_15);
        faceMap.append(16, R.drawable.face_16);
        faceMap.append(17, R.drawable.face_17);
        faceMap.append(18, R.drawable.face_18);
        faceMap.append(19, R.drawable.face_19);
        faceMap.append(20, R.drawable.face_20);
        faceMap.append(21, R.drawable.face_21);
        faceMap.append(22, R.drawable.face_22);
        faceMap.append(23, R.drawable.face_23);
        faceMap.append(24, R.drawable.face_24);
        faceMap.append(25, R.drawable.face_25);
        faceMap.append(26, R.drawable.face_26);
        faceMap.append(27, R.drawable.face_27);
        faceMap.append(28, R.drawable.face_28);
        faceMap.append(29, R.drawable.face_29);
        faceMap.append(30, R.drawable.face_30);
        faceMap.append(31, R.drawable.face_31);
        faceMap.append(32, R.drawable.face_32);
        faceMap.append(33, R.drawable.face_33);
        faceMap.append(34, R.drawable.face_34);
        faceMap.append(35, R.drawable.face_35);
        faceMap.append(36, R.drawable.face_36);
        faceMap.append(37, R.drawable.face_37);
        faceMap.append(38, R.drawable.face_38);
        faceMap.append(39, R.drawable.face_39);
        faceMap.append(40, R.drawable.face_40);
        faceMap.append(41, R.drawable.face_41);
        faceMap.append(42, R.drawable.face_42);
        faceMap.append(43, R.drawable.face_43);
        faceMap.append(44, R.drawable.face_44);
        faceMap.append(45, R.drawable.face_45);
        faceMap.append(46, R.drawable.face_46);
        faceMap.append(47, R.drawable.face_47);
        faceMap.append(48, R.drawable.face_48);
        faceMap.append(49, R.drawable.face_49);
        faceMap.append(50, R.drawable.face_50);
        faceMap.append(51, R.drawable.face_51);
        faceMap.append(52, R.drawable.face_52);
        faceMap.append(53, R.drawable.face_53);
        faceMap.append(54, R.drawable.face_54);
        faceMap.append(55, R.drawable.face_55);
        faceMap.append(56, R.drawable.face_56);
        faceMap.append(57, R.drawable.face_57);
        faceMap.append(58, R.drawable.face_58);
        faceMap.append(59, R.drawable.face_59);
        faceMap.append(60, R.drawable.face_60);
        faceMap.append(61, R.drawable.face_61);
        faceMap.append(62, R.drawable.face_62);
        faceMap.append(63, R.drawable.face_63);
        faceMap.append(64, R.drawable.face_64);
        faceMap.append(65, R.drawable.face_65);
        faceMap.append(66, R.drawable.face_66);
        faceMap.append(67, R.drawable.face_67);
        faceMap.append(68, R.drawable.face_68);
        faceMap.append(69, R.drawable.face_69);
        faceMap.append(70, R.drawable.face_70);
        faceMap.append(71, R.drawable.face_71);
        faceMap.append(72, R.drawable.face_72);
        faceMap.append(73, R.drawable.face_73);
        faceMap.append(74, R.drawable.face_74);
        faceMap.append(75, R.drawable.face_75);
        faceMap.append(76, R.drawable.face_76);
        faceMap.append(77, R.drawable.face_77);
        faceMap.append(78, R.drawable.face_78);
        faceMap.append(79, R.drawable.face_79);
        faceMap.append(80, R.drawable.face_80);
        faceMap.append(81, R.drawable.face_81);
        faceMap.append(82, R.drawable.face_82);
        faceMap.append(83, R.drawable.face_83);
        faceMap.append(84, R.drawable.face_84);
        faceMap.append(85, R.drawable.face_85);
        faceMap.append(86, R.drawable.face_86);
        faceMap.append(87, R.drawable.face_87);
        faceMap.append(88, R.drawable.face_88);
        faceMap.append(89, R.drawable.face_89);
        faceMap.append(90, R.drawable.face_90);
        faceMap.append(91, R.drawable.face_91);
        faceMap.append(92, R.drawable.face_92);
        faceMap.append(93, R.drawable.face_93);
        faceMap.append(94, R.drawable.face_94);
        faceMap.append(95, R.drawable.face_95);
        faceMap.append(96, R.drawable.face_96);
        faceMap.append(97, R.drawable.face_97);
        faceMap.append(98, R.drawable.face_98);
        faceMap.append(99, R.drawable.face_99);
        faceMap.append(100, R.drawable.face_100);
        faceMap.append(101, R.drawable.face_101);
        faceMap.append(102, R.drawable.face_102);
        faceMap.append(103, R.drawable.face_103);
        faceMap.append(104, R.drawable.face_104);
    }


}
