CREATE TABLE IF NOT EXISTS courses_disciplines (
    course_discipline_id SERIAL PRIMARY KEY,
    course_id INTEGER NOT NULL,
    discipline_id INTEGER NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY (course_id) REFERENCES courses(course_id),
    FOREIGN KEY (discipline_id) REFERENCES disciplines(discipline_id)
);