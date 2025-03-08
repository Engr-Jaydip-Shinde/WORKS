function toggleMenu() {
    let nav = document.querySelector(".nav-links");
    nav.style.display = nav.style.display === "flex" ? "none" : "flex";
}


let currentIndex = 0;
const slides = document.querySelectorAll('.quote-slide');
const totalSlides = slides.length;
const carousel = document.querySelector('.carousel');

function showNextSlide() {
  currentIndex++;
  carousel.style.transition = 'transform 0.8s ease-in-out';
  const offset = -currentIndex * 100; 
  carousel.style.transform = `translateX(${offset}%)`;
  if (currentIndex === totalSlides) {
    setTimeout(() => {
      carousel.style.transition = 'none'; 
      currentIndex = 0; 
      carousel.style.transform = 'translateX(0)'; 
    }, 70000); 
  }
}
setInterval(showNextSlide, 70000);


let timer;
let timeLeft;
let isRunning = false;

// Open and close the timer modal
function openTimerModal() {
    document.getElementById("timerModal").style.display = "block";
}

function closeTimerModal() {
    document.getElementById("timerModal").style.display = "none";
}

// Set custom timer
function setTimer() {
    let minutes = document.getElementById("timeInput").value;
    timeLeft = minutes * 60;
    document.getElementById("timerDisplay").textContent = `${minutes}:00`;
}

// Start Pomodoro Timer
function startTimer() {
    if (!isRunning) {
        isRunning = true;
        document.getElementById("timerModal").style.display = "none"; // Close modal
        document.getElementById("floatingTimer").style.display = "block"; // Show floating timer

        timer = setInterval(() => {
            if (timeLeft <= 0) {
                clearInterval(timer);
                document.getElementById("floatingTimer").style.display = "none"; // Hide floating timer
                alert("Time's up! Take a 5-minute break.");
                timeLeft = 5 * 60; 
                setTimeout(() => {
                    alert("Break over! Start a new session.");
                    setTimer();
                }, 300000);
            }
            let minutes = Math.floor(timeLeft / 60);
            let seconds = timeLeft % 60;
            document.getElementById("timerDisplay").textContent = `${minutes}:${seconds < 10 ? '0' : ''}${seconds}`;
            timeLeft--;
        }, 1000);
    }
}

// Reset Timer
function resetTimer() {
    clearInterval(timer);
    isRunning = false;
    document.getElementById("floatingTimer").style.display = "none"; // Hide floating timer
    setTimer();
}





