# AI Playground Router

AI playground with smart routing

This project is a shell-style AI playground with provider connectors, smart routing, compare mode, and usage stats.

## What it includes
- Unified prompt box for text, image, and code/debug tasks
- Auto-router that chooses the cheapest/fastest model by task type
- Compare mode across OpenAI, Anthropic, and Gemini
- Provider configuration panel with room for custom connectors later
- Usage counters and routing explanations

## Default model policy
- OpenAI: `gpt-5-mini` for code-heavy tasks
- Anthropic: `claude-haiku-4-5-20251001` for critique / debug tone
- Gemini: `gemini-2.5-flash` for fast general prompts
- Gemini image: `gemini-2.5-flash-image` for image-oriented requests

## Quick start
### Backend
```bash
cd backend
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
cp .env.example .env
uvicorn main:app --reload --port 8000
```

### Frontend
```bash
cd frontend
npm install
npm run dev
```

## Environment
Add your Emergent Universal Key to `backend/.env`:
```bash
EMERGENT_LLM_KEY=your-key-here
```

## Extending connectors
The backend provider registry is intentionally modular. Add more models or custom endpoints in `backend/services/router.py`.