package com.example.gallaryapp.domain.usecases

import com.example.gallaryapp.data.model.MediaAlbum
import com.example.gallaryapp.data.repository.GalleryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton


class AlbumListUseCase @Inject constructor(
    private val galleryRepository: GalleryRepository
) {
    operator fun invoke() : Flow<Result<List<MediaAlbum>>> {
        return galleryRepository.fetchAllMediaImages()
    }
}