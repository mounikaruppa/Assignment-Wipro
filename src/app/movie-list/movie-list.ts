import { Component } from '@angular/core';
import { NgFor, NgIf } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatSliderModule } from '@angular/material/slider';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';

interface Movie {
  title: string;
  genre: string;
  rating: number;
  description: string;
  poster: string;
}

@Component({
  selector: 'app-movie-list',
  standalone: true,
  imports: [
    NgFor, NgIf, FormsModule,
    MatFormFieldModule, MatInputModule, MatSelectModule,
    MatSliderModule, MatCardModule, MatIconModule, MatButtonModule
  ],
  templateUrl: './movie-list.html',
  styleUrls: ['./movie-list.css']
})
export class MovieListComponent {
  search = '';
  selectedGenre = '';
  minRating = 1;

  movies: Movie[] = [
    { title: 'Harry Potter and the Sorcerer\'s Stone', genre: 'Fantasy', rating: 5, description: 'The beginning of Harry\'s magical journey.', poster: 'https://m.media-amazon.com/images/I/81YOuOGFCJL.jpg' },
    { title: 'Harry Potter and the Chamber of Secrets', genre: 'Fantasy', rating: 4, description: 'The mystery of the Chamber is revealed.', poster: 'https://m.media-amazon.com/images/I/91OINeHnJGL.jpg' },
    { title: 'Harry Potter and the Prisoner of Azkaban', genre: 'Fantasy', rating: 5, description: 'Harry learns the truth about his past.', poster: 'https://m.media-amazon.com/images/I/81lAPl9Fl0L.jpg' }
  ];

  get filteredMovies() {
    return this.movies.filter(m =>
      (m.title.toLowerCase().includes(this.search.toLowerCase()) ||
       m.description.toLowerCase().includes(this.search.toLowerCase())) &&
      (this.selectedGenre === '' || m.genre === this.selectedGenre) &&
      m.rating >= this.minRating
    );
  }

  get avgRating() {
    return (this.movies.reduce((sum, m) => sum + m.rating, 0) / this.movies.length).toFixed(1);
  }
}
