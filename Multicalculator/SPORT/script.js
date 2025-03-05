document.getElementById("quizForm").addEventListener("submit", function (event) {
    event.preventDefault();
    // Sports Data
    const sports = [
        { name: "Soccer", fitness: "high", type: "team", time: "high", description: "A fast-paced team sport loved worldwide." },
        { name: "Basketball", fitness: "high", type: "team", time: "moderate", description: "Requires agility and stamina." },
        { name: "Yoga", fitness: "low", type: "solo", time: "low", description: "Focuses on flexibility and relaxation." },
        { name: "Swimming", fitness: "medium", type: "solo", time: "moderate", description: "Builds strength and endurance." },
        { name: "Cycling", fitness: "medium", type: "solo", time: "high", description: "Great for endurance and leg strength." },
        { name: "Tennis", fitness: "high", type: "solo", time: "moderate", description: "A fast-paced sport requiring agility." },
        { name: "Football", fitness: "high", type: "team", time: "high", description: "A physically demanding and strategic team sport." },
        { name: "Table Tennis", fitness: "medium", type: "solo", time: "low", description: "Quick reflexes and hand-eye coordination required." },
        { name: "Running", fitness: "high", type: "solo", time: "high", description: "A simple but effective endurance sport." },
        { name: "Badminton", fitness: "medium", type: "solo", time: "moderate", description: "A fun and fast-paced sport that improves reflexes." }
    ];
    // Collect user input
    const fitness = document.getElementById("fitness").value;
    const type = document.getElementById("type").value;
    const time = document.getElementById("time").value;
    // Find a sport that matches the user's preferences
    const recommendedSport = sports.find(
        (sport) =>
            sport.fitness === fitness &&
            sport.type === type &&
            sport.time === time
    );
    if (recommendedSport) {
        // Redirect to the result page with query parameters
        window.location.href = `result.html?sport=${encodeURIComponent(
            recommendedSport.name
        )}&description=${encodeURIComponent(recommendedSport.description)}`;
    } else {
        // If no exact match, provide a fallback random suggestion
        const fallbackSport = sports[Math.floor(Math.random() * sports.length)];
        window.location.href = `result.html?sport=${encodeURIComponent(fallbackSport.name)}&description=${encodeURIComponent(fallbackSport.description)}`;
    }
});