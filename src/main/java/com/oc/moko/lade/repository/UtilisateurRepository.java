package com.oc.moko.lade.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oc.moko.lade.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, UUID> {

}
