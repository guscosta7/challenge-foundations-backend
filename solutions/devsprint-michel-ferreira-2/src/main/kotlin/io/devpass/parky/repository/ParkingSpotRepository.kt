package io.devpass.parky.repository

import io.devpass.parky.entity.ParkingSpot
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ParkingSpotRepository : CrudRepository<ParkingSpot, Int> {
    fun findByFloorAndSpot(floor: Int, spot: Int): ParkingSpot?
    fun findByInUseByIsNull(): List<ParkingSpot>
    fun getAllParkingSpots(): List<ParkingSpot>
    fun findByInUseBy(): List<ParkingSpot>

}