# BlackOut in Dungeon👻
Blackout in Dungeon is a randomly generated maze game, where player needs to collect numbers of items and escape the dungeon in as little time as possible. 

<h3 align="center">

 <!-- Status -->
 <img alt="Status do Projeto" src="https://img.shields.io/badge/Status-Finished-lightgrey?style=for-the-badge&logo=headspace&logoColor=green&color=9644CD&labelColor=1C1E26">

 <!-- License -->
  <a href="./LICENSE" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/license%20-MIT-1C1E26?style=for-the-badge&labelColor=1C1E26&color=9644CD">
  </a>

</h3>

<p align="center"><img width="700" alt="image" src="https://github.com/yrdsb-peths/final-greenfoot-project-Vanessa-Huo/assets/130993636/adc0d5ad-f2e4-4fe3-b0ab-8c59fdf6d555">

## Description 
The player uses **&#8592;**, **&#8594;**, **&#8593;** and **&#8595;** to control the *Explorer* to collect 12 *Coins8*, 2 *Red Flasks* and 2 *Blue Flasks* that are randomly generated at different locations in the maze. While exploring the maze and collecting items, the *Explorer* needs to avoid the enemies and triggers in the maze that will reduce *Lifepoints*.

## Get Started 
1. Download [Greenfoot](https://www.greenfoot.org/download)
2. Download [Github](https://desktop.github.com/)
3. Clone the game repository using link: 
    ```sh
    $ git clone https://github.com/yrdsb-peths/final-greenfoot-project-Vanessa-Huo.git
    ```
4. Use the Greenfoot to run the file `project.greenfoot`
5. Click `Run` to play the game!

## Features
- Explorer has three *Lifepoints*
- Attacking System
  - Peaks: Stepping on peaks reduces 1 LP
  - Blue skull ghost: Touching ghost reduces 1 Lp
  - Flame: Coming from the top and the left side. Getting burnt reduces 1 Lp
- Every time you start a New Game, there is a possiblity of generating:
  - 15-20 coins 
  - 2 red flasks
  - 2 blue flasks
  - 3-5 peaks on the ground
  - 2-3 flame coming from the top
  - 2-3 flame coming from the left
  - 2-3 skull ghosts wandering around
 
## Cheat Code
1. Go to `MyWorld` class
2. Comment out following two lines:
   ```sh
    View view = new View(player);
    addObject(view,player.getX(),player.getY());
    ```

## Credits
The game wouldn't be made without the help from: 
- Mr.Chan - For support
- [PIHEL_POEM](https://pixel-poem.itch.io/dungeon-assetpuck) - For the dungeon asset pack
- [JGaudio](https://www.pond5.com/sound-effects/item/37669917-arcade-game-mission-failed-12-quest-game-over-level-down) - For sound effects 
- [Undertale](https://youtu.be/FKdtstAo6iU) - For background music

## License
This template and the code in it is licensed under the [MIT License](https://github.com/marcizhu/readme-chess/LICENSE). 

<p align="center">
<img src="https://raw.githubusercontent.com/trinib/trinib/a5f17399d881c5651a89bfe4a621014b08346cf0/images/marquee.svg">
