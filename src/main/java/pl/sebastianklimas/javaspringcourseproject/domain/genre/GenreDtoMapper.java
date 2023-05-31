package pl.sebastianklimas.javaspringcourseproject.domain.genre;

import pl.sebastianklimas.javaspringcourseproject.domain.genre.dto.GenreDto;

class GenreDtoMapper {
    static GenreDto map(Genre genre) {
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}
