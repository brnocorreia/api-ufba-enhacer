CREATE TABLE IF NOT EXISTS courses (
    course_id SERIAL PRIMARY KEY,
    code INT NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    shift VARCHAR(15) NOT NULL,
    min_duration INT NOT NULL,
    max_duration INT NOT NULL,
    legal_base TEXT DEFAULT NULL,
    description TEXT DEFAULT NULL,
    ob_workload INT NOT NULL,
    op_workload INT NOT NULL,
    ac_workload INT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);