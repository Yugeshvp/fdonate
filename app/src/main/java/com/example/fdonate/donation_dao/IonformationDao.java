package com.example.fdonate.donation_dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.fdonate.model_class.InformationModel;

import java.util.List;

@Dao
public interface IonformationDao {
    @Insert
    long insertNewDonation(InformationModel model);

    @Query("select * from tbl_Donation")
    List<InformationModel> getAllDonationList();
}
