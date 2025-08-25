import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MusicPlaylistComponent } from './music-playlist';

describe('MusicPlaylist', () => {
  let component: MusicPlaylistComponent;
  let fixture: ComponentFixture<MusicPlaylistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MusicPlaylistComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MusicPlaylistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
