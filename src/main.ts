import { bootstrapApplication } from '@angular/platform-browser';
import { provideAnimations } from '@angular/platform-browser/animations';
import { MovieListComponent } from './app/movie-list/movie-list';

bootstrapApplication(MovieListComponent, {
  providers: [provideAnimations()]
});
